package com.raveena.fridgemanager;

interface RefactorFoodModel {
 void assignExpiryTime();
}
class Fruits implements RefactorFoodModel{
 private int expirationTime;    // Based on category, gives days it expires in
 @Override
 public void assignExpiryTime() {
  expirationTime = 14;
 }
}
class Vegetables implements RefactorFoodModel{
 private int expirationTime;    // Based on category, gives days it expires in
 @Override
 public void assignExpiryTime() {
  expirationTime = 14;
 }
}
class Dairy implements RefactorFoodModel{
 private int expirationTime;    // Based on category, gives days it expires in
 @Override
 public void assignExpiryTime() {
  expirationTime = 14;
 }
}
class Grains implements RefactorFoodModel{
 private int expirationTime;    // Based on category, gives days it expires in
 @Override
 public void assignExpiryTime() {
  expirationTime = 14;
 }
}

class Other implements RefactorFoodModel{
 private int expirationTime;    // Based on category, gives days it expires in
 @Override
 public void assignExpiryTime() {
  expirationTime = 15;
 }
}
