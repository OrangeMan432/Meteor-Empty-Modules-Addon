# Meteor Starscript Modules
This adds a few modules that do nothing, intended for Starscript key press detection.  
This is a basic script to change the color of the letter W when the WKey module is enabled.  
"Toggle on bind release" should be on and "Chat Feedback" off.  
`{meteor.is_module_active("WKey") ? #5 "W" : #3 "W"}`  
