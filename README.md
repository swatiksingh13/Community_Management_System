# Community Management System

**Community Management System** is a Spring Boot application designed to manage communities, discussions, replies, and users. It includes RESTful APIs for creating and managing these entities. The application uses a MySQL database and JPA for persistence.

## Features

- <b>Community Management</b></span>: Create and manage communities, set moderators, and allow users to join communities.
- <b>Discussion Management</b></span>: Create and manage discussions within communities.
- <b>Reply Management</b></span>: Add replies to discussions.
- <b>User Management</b></span>: Create and manage user accounts.

## Project Structure

**Controllers**: Handle HTTP requests and map them to services. <br>
CommunityController: Manages community-related operations. <br>
DiscussionController: Manages discussion-related operations.<br>
ReplyController: Manages reply-related operations.<br>
UserController: Manages user-related operations.<br>

**Models**: Define the structure of the application's data.<br>
Community: Represents a community.<br>
Discussion: Represents a discussion in a community.<br>
Reply: Represents a reply to a discussion.<br>
User: Represents a user.<br>

**Repositories**: Provide CRUD operations for models using JPA.<br>
CommunityRepository<br>
DiscussionRepository<br>
ReplyRepository<br>
UserRepository<br>

**Services**: Contain business logic and interact with repositories.<br>
CommunityService<br>
DiscussionService<br>
ReplyService<br>
UserService<br>
**Configuration**: Application properties configuration for database connection. <br>


## Endpoints.

**CommunityController** <br>
POST /addNewCommunity: Add a new community. <br>
POST /setModerators/{communityId}/{userId}: Set a user as a moderator of a community. <br>
POST /joinCommunity/{communityId}/{userId}: Add a user to a community. <br>
GET /getCommunity/{id}: Get a community by ID.<br>
GET /getAll: Get all communities.<br>

**DiscussionController**
POST /setDiscussions: Add a new discussion. <br>
**ReplyController**
POST /reply: Add a reply to a discussion.<br>
**UserController**
POST /addNewUser: Add a new user.<br>

## Dependencies
**Spring Boot**,
**Spring Data JPA**,
**Hibernate**,
**MySQL Driver**,
**Lombok**
