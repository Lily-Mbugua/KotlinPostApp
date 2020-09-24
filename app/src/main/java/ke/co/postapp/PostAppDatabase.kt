package ke.co.postapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.postsapp.models.Post

class PostAppDatabase {
    @Database(entities = [Post::class], version = 1)
    abstract class PostAppDatabase: RoomDatabase() {
        abstract fun postDao():PostsDao

        companion object{
            private var dbInstance:PostAppDatabase? = null

            fun getDBInstance(context: Context):PostAppDatabase{
                if(dbInstance==null){
                    dbInstance= Room.databaseBuilder(context,PostAppDatabase::class.java, "postsapp-db").build()
                }
                return dbInstance as PostAppDatabase
            }
        }

    }
}

class Room {

}