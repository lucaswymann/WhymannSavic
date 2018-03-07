package info.androidhive.imagefilters;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {User.class}, version = 1)
public abstract class ImageInationDb extends RoomDatabase {

    private static Builder<ImageInationDb> INSTANCE;

    public abstract UserDao userDao();

    public static Builder<ImageInationDb> getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ImageInationDb.class, "user");
            INSTANCE.allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public static void destroyInstance(){
        INSTANCE = null;
    }
}
