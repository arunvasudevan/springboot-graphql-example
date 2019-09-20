# springboot-graphql-example

Clone Repo - git clone https://github.com/arunvasudevan/springboot-graphql-example.git

Run the project using `mvn spring-boot run`

Hit the GraphiQL UI interface - http://localhost:8080/graphiql

Input:

`{
    pets {
        name
        age
      	type
    }
}`


Expected Output:

`{
  "data": {
    "pets": [
      {
        "name": "Jimmy",
        "age": 9,
        "type": "DOG"
      }
    ]
  }
}`
