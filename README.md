# Shared-Models

## Overview
Shared-Models is a core library for the SUPMAP application, providing standardized data models, DTOs, and common entities
shared across all microservices. This module ensures data consistency, reduces code duplication, and simplifies
cross-service communication.

## Features
- Common Data Models: Standardized entities used across the entire SUPMAP ecosystem
- Request/Response DTOs: Well-defined data transfer objects for API communication
- Validation Rules: Centralized validation logic for consistent data integrity
- Type Safety: Ensures type consistency across all services
- Cross-Service Compatibility: Facilitates seamless communication between microservices

## Key Model Categories

### Authentication Models
Models for user registration, login, password management, and OAuth2 authentication.

### Map Models
Models for navigation, route calculation, traffic alerts, location sharing, and favorite locations.

### User Models
Models for user profiles, preferences, administrative operations, and location tracking.

### Notification Models
Models for notification preferences and delivery settings.

### Contact Models
Models for support requests, newsletter subscriptions, and communication management.

## Usage

Import the shared-models library into your service:

<dependency>
    <groupId>com.novus</groupId>
    <artifactId>shared-models</artifactId>
    <version>${project.version}</version>
</dependency>

Then use the models in your service implementations:

import com.novus.shared_models.request.Map.GetAllAlertsByPositionRequest;
import com.novus.shared_models.response.Map.GetAllAlertsByPositionResponse;

@Service
public class MapServiceImpl implements MapService {

    public ResponseEntity<GetAllAlertsByPositionResponse> getAllAlertsByPosition(
            GetAllAlertsByPositionRequest request,
            HttpServletRequest httpRequest
    ) {
        // Service implementation using shared models
    }
}

## Benefits of Using Shared-Models

1. Consistency: Ensures all services use the same data structures
2. Maintainability: Changes to models only need to be made in one place
3. Type Safety: Compiler-enforced type checking across service boundaries
4. Documentation: Serves as a documentation of the system's data flow
5. Versioning: Allows for controlled evolution of the API contracts

## Development Guidelines

When modifying or extending shared models:

1. Maintain backward compatibility when possible
2. Use meaningful names that reflect the purpose of the model
3. Include proper validation annotations
4. Document any complex fields or relationships
5. Keep models focused and cohesive
6. Follow the established package structure

## Integration with Swagger/OpenAPI

These models are directly used for API documentation via Swagger. The DTO classes contain annotations
that generate comprehensive API documentation.

## Building

To build the shared-models module:

mvn clean install

This will compile the code, run tests, and install the artifact to your local Maven repository for use in other modules.