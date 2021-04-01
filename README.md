# SpringBootRestAPI- Samsung PRISM worklet-V146VIT

by: Lakhan Lal Nad, Lishi Patel, P Rohit, Mayank Patel




This is our project in which we would be hosting a RESTful API by using springboot and later get and post requests accordingly
so as to facilitate search operation through Natural language command. 

Dataset Capture / Preparation / Generation : 
-- Location>Room>Device>Capabilities are entities of our dataset.
--We are using our dummy dataset.
--https://smartthings.developer.samsung.com/docs/locations/locations-overview.html

Dataset Understanding / Analysis : 
-JSON  is  use a primary storage of data
-JSON format will be used to display data
-Queries will be preprocessed through the NLP Pipeline
-Search Function will be implemented with location>room>device priority order

Dataset Pre-Processing:
JSON format of given tsv format
[['B-action', {'text': 'turn', 'start': 0, 'end': 3}]],
[['B-action', {'text': 'turn', 'start': 0, 'end': 3}], 
['B-state', {'text': 'on', 'start': 5, 'end': 6}]]
[['B-action', {'text': 'turn', 'start': 0, 'end': 3}], 
['B-state', {'text': 'on', 'start': 5, 'end': 6}], 
['B-device', {'text': 'AC', 'start': 8, 'end': 9}]]
[['B-action', {'text': 'turn', 'start': 0, 'end': 3}], 
['B-state', {'text': 'on', 'start': 5, 'end': 6}], 
['B-device', {'text': 'AC', 'start': 8, 'end': 9}], 
['B-room', {'text': 'bedroom', 'start': 18, 'end': 24}]]

->Queries are processing through NLP pipelines.
->Queries will be preprocessed and following format will be input for a query like : “turn on the AC in the bedroom”.

Final Deliverables : 
->Increase the accuracy of the model.
->Deploy  the API ,and test better search performance.
->Testing and improvement.
->Demo using virtual and real devices.








