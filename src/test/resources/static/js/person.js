$(document)
			.ready(
					function() {
						var CreateCustomer = function() {
							var instance = {};
							instance.CustomerEvent = {
							    SELECTED: 'UXEvent.CustomerService.SearchCustomer.CustomerSelected',
							    SUBMIT: 'UXEvent.CustomerService.CreateCustomer.Submit',
							    SUBMITTED: 'UXEvent.CustomerService.CreateCustomer.Submitted',
							    DUPLICATED: 'UXEvent.CustomerService.CreateCustomer.CustomerDuplicateFound'
							}
							
							var selectedSubscriber = function(msg, data) {
							    console.log('[SUBSCRIBED] ' + instance.CustomerEvent.SELECTED);
                                console.log('msg: ' + msg);
                                EcareFramework.refreshFrameByGroupId('createCustomer');
                                setReadOnlyMode(true);
                                if (EcarePubSub) {
                                    EcarePubSub.unsubscribe(selectedSubscriber);
                                }
							};
							
							var submitSubscriber = function(msg, data) {
							    console.log('[SUBSCRIBED] ' + instance.CustomerEvent.SUBMIT);
							    customerSubmit();
                                if (EcarePubSub) {
                                    EcarePubSub.unsubscribe(submitSubscriber);
                                    EcarePubSub.publish(instance.CustomerEvent.SUBMITTED);
                                }
                                submitAsyncForm('createCustomerForm', false, true);
							}; 
							
							var submittedSubscriber = function(msg, data) {
							    console.log(instance.CustomerEvent.SUBMITTED + ' [NOT HANDLED HERE!]');
							    if (EcarePubSub) {
							        EcarePubSub.unsubscribe(submittedSubscriber);
							    }
							};
							
						
							
							function initPubSubEvents() {
							    if(EcarePubSub){
							        /* var duplicateHandle = EcarePubSub.subscribe(instance.CustomerEvent.DUPLICATED, function(name, args){
							            console.log(instance.CustomerEvent.DUPLICATED + ' [NOT HANDLED HERE!]');
							            EcarePubSub.unsubscribe(duplicateHandle);
						            }); */
							        
							        var selectedHandle = EcarePubSub.subscribe(instance.CustomerEvent.SELECTED, selectedSubscriber);
							        
							        var submitHandle = EcarePubSub.subscribe(instance.CustomerEvent.SUBMIT, submitSubscriber);
							        
							        var submittedHandle = EcarePubSub.subscribe(instance.CustomerEvent.SUBMITTED, submittedSubscriber);
							    }
							}
														
							instance.init = function() {
								$('#otherAddressFields').slideUp();
								$(
										'input[name="corespondenceAddressDifferent"]',
										'#createCustomer').prop('checked',
										false);
								console.log('${ReadOnlyMode}');
								var readOnlyMode = '${ReadOnlyMode}' === 'true';
								setReadOnlyMode(readOnlyMode);
								if (EcarePubSub) {
								    console.log('Unsubscribe all related events, if exists...');
								    if (selectedSubscriber !== undefined) {
								       console.log('[UNSUBSCRIBE] ' + instance.CustomerEvent.SELECTED);
								       EcarePubSub.unsubscribe(selectedSubscriber);
								    }
								    if (submitSubscriber !== undefined) {
								        console.log('[UNSUBSCRIBE] ' + instance.CustomerEvent.SUBMIT);
								        EcarePubSub.unsubscribe(selectedSubscriber);
								    }
								    if (submittedSubscriber !== undefined) {
								        console.log('[UNSUBSCRIBE] ' + instance.CustomerEvent.SUBMITTED);
								        EcarePubSub.unsubscribe(selectedSubscriber);
								    }
								}
																															
								setEvents();
								
							}
							
							var setReadOnlyMode = function(mode) {
								$('.create-customer-field').prop('disabled', mode);	
								return mode;
							}
							
							
							
							function createHttpRequest() {
								
							}
							
							function submitAsyncForm(formId, isAnimated, validate){						        
						        loadAsyncForms(formId, isAnimated, validate);
						    }

							function setEvents() {
								$(
										'#createCustomer input[name="corespondenceAddressDifferent"]')
										.on(
												'change',
												function() {
													var showSecondaryAddressFields = $(
															'input[name="corespondenceAddressDifferent"]:checked',
															'#createCustomer')
															.val();

													if (showSecondaryAddressFields === 'true') {
														$('#otherAddressFields')
																.slideDown();
													} else {
														$('#otherAddressFields')
																.slideUp();
													}
												});
								
								 $('#createCustomerForm').on('submit', function(e) {
								     e.preventDefault();
							         e.stopPropagation();
								     console.log('UXEvent.CustomerService.CreateCustomer.Submit');
	                                    alert('stop1');
	                                    var url = "${cmspageaction}/next-step";
	                                    $.ajax({
	                                        type: 'POST',                                    
	                                        contentType: "application/json; charset=utf-8",
	                                        url: url,           
	                                        data: $('#createCustomerForm').serialize(),  
	                                        statusCode:{
	                                            404: function() {
	                                                $('#js_errors').html("Page not found.");
	                                            },
	                                            403: function() {
	                                                $('#js_errors').html("Forbidden access! Have a nice day! :D");
	                                            },
	                                            401: function() {
	                                                $('#js_errors').html("Unauthorized access! Go away! :/");
	                                            },
	                                            406: function() {
	                                                $('#js_errors').html('Not acceptable validation errors.');
	                                            },
	                                            201: function() {
	                                                $('#js_errors').html('Customer has been created.');
	                                            },
	                                            200: function() {
	                                                $('#js_errors').html('OK');
	                                            },
	                                            202: function() {
	                                                $('#js_errors').html('Data accepted.');
	                                            },
	                                            204: function() {
	                                                $('#js_errors').html('No content.');
	                                            },
	                                            302: function() {
	                                                $('#js_errors').html('Found');
	                                            },
	                                            400: function() {
	                                                $('#js_errors').html('Bad Request');
	                                            },
	                                            409: function() {
	                                                $('#js_errors').html('Conflict. Duplicated customer.');
	                                            }
	                                        },
	                                        success: function(data) {
	                                            console.log('data: ' + data);
	                                            
	                                            if (EcarePubSub) {
	                                                EcarePubSub.publish(instance.CustomerEvent.SUBMITTED);
	                                            }
	                                            alert('success');
	                                        },
	                                        error: function(jqXHR, textStatus, errorThrown) {
	                                            console.log(textStatus, errorThrown);
	                                            alert('error');
	                                        }
	                                    });
	                                });
	                                
								}
								
								initPubSubEvents();
								
							}
							
							
												

							return instance;
						}();

    						CreateCustomer.init();
							
    					});