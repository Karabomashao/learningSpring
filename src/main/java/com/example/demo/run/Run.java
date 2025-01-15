package com.example.demo.run;

import java.time.LocalDateTime;

public record Run(Integer id,
                  String title,
                  LocalDateTime statedOn,
                  LocalDateTime completeOn,
                  Integer miles,
                  Location location) {
}
