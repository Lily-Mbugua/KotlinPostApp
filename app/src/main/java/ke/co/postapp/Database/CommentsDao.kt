package ke.co.postapp.api.Database

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataScope
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.postsapp.models.Comment
import com.example.postsapp.models.Post