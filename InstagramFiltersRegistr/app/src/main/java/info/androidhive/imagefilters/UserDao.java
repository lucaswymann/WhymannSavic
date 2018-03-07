package info.androidhive.imagefilters;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Query("Select * from user where username like :username and password like :password")
    User findByUsername(String username, String password);

    @Query("SELECT COUNT(*) from user")
    int countUsers();

    @Delete
    void delete(User user);

    @Insert
    void insertAll(User... users);
}
