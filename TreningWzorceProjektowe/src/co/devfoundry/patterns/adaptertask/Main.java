package co.devfoundry.patterns.adaptertask;

import co.devfoundry.patterns.adaptertask.api.LibraryAPI;
import co.devfoundry.patterns.adaptertask.api.LibraryAPIImpl;
import co.devfoundry.patterns.adaptertask.api.LibraryAPIv2;
import co.devfoundry.patterns.adaptertask.api.LibraryAPIv2Impl;

public class Main {
    public static void main(String[] args) {

        User user = new User("Paweł","Cwik","32131212");

        LibraryAPI api = new LibraryAPIImpl();
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);

        BookConnector connector = new BookConnector(user,apiAdapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");
    }
}
