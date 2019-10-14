## README

## Requisitos

Conocer:
* Product Name: project_greeting_dal

Datos GCP:
* GCP Project Id: reemplazar project-id por proyecto de gcp

## Uso manual

El pipeline de CI debería realizar estos pasos.

gradle build

docker build . -t "gcr.io/[project-id]/project-greeting-dal" -f Dockerfile

docker push gcr.io/[project-id]/project-greeting-dal:latest

kubectl apply -f deploy/[ambiente]/k8s/deployment.yaml

## Pendiente
gcloud endpoints services deploy deploy/enpoints/openapi.yml

Falta modificar algunos valores que deben ser paramétricos
