Basic Springboot template v0.1

Base template that can be used a starter project.  Hooked up the following together.

1.	SpringBoot – Web 
2.	SpringBoot – Security (Security not enabled; all access provided)
3.	SpringBoot – Thymeleaf (No special handling done)
4.	SpringBoot – MongoDB (Not configured params)

Other Implementation:
1.	Book Object
2.	Book Repository stores on MongoDB
3.	Book Rest Controller to implement CRUD

Prerequests:
Ensure the MongoDB is installed and local instance is running before running the app.

How to run this application:

Run this app as SpringBoot

http://localhost:8080/
Hello null!
Signout button

http://localhost:8080/hello
Hello null!
Signout button

http://localhost:8080/book
Result should be blank

Use a Browser plugin like RESTClient for Firefox to initiate POST requests:
URL: http://localhost:8080/book
Header: 

Name	Content-Type
Value	application/json;charset=UTF-8
Body:
{
"name":"Jungle book",
"isbn":"12345",
"author":"sudhakar",
"pages":200
}

Should see response as below:
{"message":"Book created successfully","book":{"id":"5760c149a7c8b745392a781e","name":"Jungle book","isbn":"12345","author":"sudhakar","pages":200}}

List all books from database with this Get request:

http://localhost:8080/book
{"totalBooks":1,"books":[{"id":"5760c149a7c8b745392a781e","name":"Jungle book","isbn":"12345","author":"sudhakar","pages":200}]}


Verify the Database changes:
> use test
switched to db test
> show collections
book
webURL
> db.book.find()
{ "_id" : ObjectId("5760c149a7c8b745392a781e"), "_class" : "com.sample2.feeder.model.Book", "name" : "Jungle book", "isbn" : "12345", "author" : "sudhakar", "pages" : 200 }

