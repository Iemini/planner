package com.iemini.fernando.planner.activities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ActivityData(UUID id, String title, LocalDateTime occursAt) {

}
