package com.example.MeetingsCalendar;

import java.time.Duration;
import java.time.ZonedDateTime;

public class Meeting {

    private final ZonedDateTime startsAt;
    private final Duration duration;
    private final String description;
    private final String id;

    public ZonedDateTime getStartsAt(){
        return startsAt;
    }

    public Duration getDuration(){
        return duration;
    }

    public String getDescription(){
        return description;
    }

    public String getId(){
        return id;
    }


    public static Builder newBuilder() {
        return new Builder();
    }

    private Meeting(Builder builder) {
        this.startsAt = builder.startsAt;
        this.duration = builder.duration;
        this.description = builder.description;
        this.id = builder.id;
    }

    public static class Builder {

        private ZonedDateTime startsAt;
        private Duration duration;
        private String description;
        private String id;

        public Builder startsAt(ZonedDateTime startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        public Builder duration(Duration duration) {
            this.duration = duration;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Meeting build() {
            return new Meeting(this);
        }
    }
}
