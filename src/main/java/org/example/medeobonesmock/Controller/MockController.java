package org.example.medeobonesmock.Controller;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Defines this class as a REST controller
@RestController
public class MockController {

  // Maps GET requests to /api/users
  @GetMapping("/api/users")
  public List<Map<String, Object>> getMockUsers() {
    // A hardcoded list of data representing the mock response
    return List.of(
        Map.of("id", 1, "name", "Alice Mock", "status", "active"),
        Map.of("id", 2, "name", "Bob Stub", "status", "inactive")
    );
  }
}