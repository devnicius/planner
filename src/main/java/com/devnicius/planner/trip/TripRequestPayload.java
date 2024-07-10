package com.devnicius.planner.trip;

import java.util.List;

// classe que gera por automaticamente os métodos GET e SET
public record TripRequestPayload(String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {

}
