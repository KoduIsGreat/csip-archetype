## Purpose
An archetype project designed to bootstrap csip microservices.

## Prerequisites 
1. git
2. maven 3.3.9
3. java 1.8 sdk
## Use
To use this this archetype perform three steps
1. git clone the repository `git clone <provided_url>`
2. build and install the archetype into you're local maven repository `mvn install archetype:update-local-catalog`
3. finally update you're maven archetype catalog `mvn archetype:crawl`

Then in your favorite IDE create a new project from a maven archetype and choose the `org.rti:csip-archetype` archetype.
Specify the groupId and artifact for the new project. By convention groupId for CSIP services are typically either `d` or `m`
to indicate either a data service or model service. The chosen artifactId will also be set as the root servlet context for the jersey
application(e.g if the artifactId is "csip-nwm"  any services will be hosted under localhost:8084/csip-nwm/).
The archetype will create the following directory structure.
```
 --src
    --main
        --docker
            -- Dockerfile
            -- docker-compose.yml
        --java
          --{groupId}
            --services
                --V1.java
                --V1.json    
            --util
                --Util.java
            --ApplicationConfig.java
            
        --resources
    --test
        --java
            --{groupId}
                --services
                    --ServiceTest.java
                    --response.json
                    --request.json
 
 --web
    --META-INF
        --contex.xml
    --WEB-INF
        --csip-defaults.json
```