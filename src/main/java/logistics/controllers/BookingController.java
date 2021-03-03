package logistics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @GetMapping(value = "/check")
    private String getBooking() {
        return "I am Somthing";
    }
}