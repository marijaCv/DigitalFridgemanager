package com.raveena.fridgemanager;

interface Refactor2FoodModel {
 void assignExpiryTimeIfFrozen();
 void assignExpiryTimeNotFrozen();
}

class MeatEggs implements Refactor2FoodModel{
 private int expirationTime;    // Based on category, gives days it expires in
 public void assignExpiryTimeIfFrozen() {
   expirationTime = 30;
 }
 public void assignExpiryTimeNotFrozen() {
  expirationTime = 7;
 }
}

class Fish implements Refactor2FoodModel{
 private int expirationTime;    // Based on category, gives days it expires in
 public void assignExpiryTimeIfFrozen() {
  expirationTime = 30;
 }
 public void assignExpiryTimeNotFrozen() {
  expirationTime = 7;

 }
}
