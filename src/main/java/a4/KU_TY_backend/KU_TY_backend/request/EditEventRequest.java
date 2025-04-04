package a4.KU_TY_backend.KU_TY_backend.request;

import a4.KU_TY_backend.KU_TY_backend.common.EventStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;
@Data
public class EditEventRequest {
    private UUID eventId;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalTime startTime;
    private String location;
    private int capacity;
    private String typeName;
    @Enumerated(EnumType.STRING)
    private EventStatus status;
}
