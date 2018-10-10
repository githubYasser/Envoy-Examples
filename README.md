** Features
This is the same example from (https://www.envoyproxy.io/docs/envoy/latest/start/sandboxes/front_proxy.html) but with following features:

* mtls encryption between services and certificate validation. The validation is done with an external springboot application.
* JWT validation


** Test the application
* Download docker and docker-compose
* Run:
  - docker-compose build
  - docker-compose up
