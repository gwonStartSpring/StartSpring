package test.crud.domain.user.facede;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import test.crud.domain.user.domain.repository.UserRepository;

@RequiredArgsConstructor
@Component
public class UserFacade {

    private final UserRepository userRepository;
    /*
    public User getCurrentUser() {
        String accountId = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByAccountId(accountId)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }

     */
}
