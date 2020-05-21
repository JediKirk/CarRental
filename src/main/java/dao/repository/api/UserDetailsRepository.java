package dao.repository.api;

import dao.entity.UserDetails;

public interface UserDetailsRepository {
    UserDetails saveUserDetails(UserDetails userDetails);
}
