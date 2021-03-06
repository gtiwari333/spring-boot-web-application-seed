package gt.app.web.rest;

import gt.app.config.security.AppUserDetails;
import gt.app.config.security.SecurityUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class UserResource {

    @GetMapping("/account")
    public AppUserDetails getAccount() {
        return SecurityUtils.getCurrentUser();
    }
}
