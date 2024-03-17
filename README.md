## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# 🧑‍🏭 Work: model package:
**package com.bookify.model**
> Thease are all the classes 
  1.  Author.java
  2.  Genre.java
  3.  BookCategory.java
  4.  Book.java     [M]
  5.  Wishlist.java
  6.  Subscription.java
  7.  SubscriptionLogHistory.java
  8.  UserReview.java
  9.  CustomerAddress.java
  10. Customer.java [M]
  11. OrderDetail.java
  12. Orders.java   [M]

### 🏛️ Model Classes
- tbl_book-> Book.java
  - BookCategory.java
  - Genre.java
  - Author.java
- tbl_customer -> Customer.java
  - CustomerAddress.java
  - ShoppingCart -> CartItem.java
  - Wishlist.java List<Books>
  - SubscriptionLogHistory.java
    - Subscription.java
- tbl_order-> Orders.java
  - OrderDetail.java