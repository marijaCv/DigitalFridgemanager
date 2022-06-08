package com.raveena.fridgemanager;

interface Subject {
        public void addItemRegister(Observer o);
        public void removeItemUnregister(Observer o);
        public void notifyObserver();
}
