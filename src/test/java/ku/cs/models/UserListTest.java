package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList;

    @BeforeEach     
    void init(){
        userList = new UserList();
        userList.addUser("aaa", "111");
        userList.addUser("bbb", "222");
        userList.addUser("ccc", "333");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them
        User user = userList.findUserByUsername("aaa");
        
        // TODO: assert that UserList found User
         String expected = "aaa";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user
        boolean actual = userList.changePassword("bbb", "111", "1234");

        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password
        User actual = userList.login("ccc", "333");

        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("ccc");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("aaa", "222");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}