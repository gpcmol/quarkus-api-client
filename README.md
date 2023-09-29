# Play garden quarkus experiments

1 Showcase: to show that the code is running on a thread or virtual thread. (Un)Comment @RunOnVirtualThread in PunkResource.
```
curl http://localhost:8080/punk/beers | jq
```

2
Showcase: to show that PunkResource is calling an external api with minimal configuration. See https://punkapi.com/documentation/v2

3
In case of having multiple url query parameters, use @BeanParam with inside the query parameters as fields
