## User
 - id
 - name
 - email

## Location
 - id
 - label
 - longitude
 - latitude
 - address
 - manager

## Room
 - id
 - location_id
 - location_name
 - label

## Device
 - room_id
 - room_label
 - location_id
 - location_label
 - label
 - type
 - model_name
 - brand_name

## Trait
 - id
 - name
 - device_id
 - attribute
 - state
 - enum || null
