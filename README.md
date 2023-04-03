# ND035-P02-VehiclesAPI-Project

Project repository for JavaND Project 2, where students implement a Vehicles API using Java and Spring Boot that can communicate with separate location and pricing services.

## Instructions

Check each component to see its details and instructions. Note that all three applications
should be running at once for full operation. Further instructions are available in the classroom.

- [Vehicles API](vehicles-api/README.md)
- [Pricing Service](pricing-service/README.md)
- [Boogle Maps](boogle-maps/README.md)

## Dependencies

The project requires the use of Maven and Spring Boot, along with Java v11.

## Test

## Optional TODO

- The Boogle Maps application does not actually store the address assigned to a given vehicle based on latitude and longitude, and instead randomly assigns a new one each time it is called. How could you update this to track which address is assigned to which vehicle? What happens if the vehicle latitude and longitude is updated in the Vehicles API?
- The Pricing Service stores prices based on ID, but that ID is not truly assigned to a specific vehicle - if the vehicle is deleted and a new vehicle uses the old ID, the same price is used. How can you update the Pricing Service (and perhaps the Vehicles API) to assign a new (random) price when a vehicle is removed from the Vehicles API?
- An additional helpful service after the Vehicles API would be to have an Orders/Sales service when a customer wants to order a vehicle. How would you implement this Orders/Sales API and integrate it with the Vehicles API?
