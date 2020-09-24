package ke.co.postapp.ui

import com.example.postsapp.models.Post

interface PostItemClickListener {
    fun onItemClick(post:Post)
}