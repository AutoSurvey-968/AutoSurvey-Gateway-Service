# AutoSurvey Gateway Service

## Project Description

The gateway service serves as the single point that a user is able to directly interface with the micro-service application. All requests from the user goes to the gateway first.

## Technologies Used

- Spring Cloud Gateway - version 3.0.2
- Spring Cloud Eureka - version 3.0.2
- Spring Boot WebFlux - version 5.3.7

## Features

List of features ready and TODOs for future development

- Routes the user requests to the micro-services

To-do list:

- Implements circuit breaking if a micro-service throws an error

## Getting Started

- Clone the git repository (Https)

  - `git clone https://github.com/AutoSurvey-968/AutoSurvey-Gateway-Service.git [local directory]`

- Eureka URL (if you do not plan on serving application locally), set an Environment Variable named `EUREKA_URL` to the URI that you are exposing for the application.
  - If using Docker, pass the `EUREKA_URL` as an argument when you create the container containing the gateway
  - `docker create (image) -e [EUREKA_URL]`

## Usage

Once you've successfully installed and configured the gateway, continue onto the discovery service which will allow your micro services to be recognized by the gateway.

## Contributors

- Dakota
- Parker
- Tyler
