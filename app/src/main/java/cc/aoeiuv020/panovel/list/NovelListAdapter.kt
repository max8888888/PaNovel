package cc.aoeiuv020.panovel.list

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import cc.aoeiuv020.panovel.data.entity.Novel
import java.util.*

class NovelListAdapter(
        @LayoutRes
        private val layout: Int,
        private val itemListener: NovelItemActionListener = NovelItemActionAdapter()
) : RecyclerView.Adapter<NovelListViewHolder>() {
    var data: List<Novel> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    // 打开时存个最小时间，手动刷新时更新这个时间，
    // 如果小说刷新时间checkUpdateTime小于这个时间就联网刷新章节列表，
    private var refreshTime = Date(0)

    fun refresh() {
        refreshTime = Date()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovelListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return NovelListViewHolder(itemView, itemListener)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: NovelListViewHolder, position: Int) {
        val novel = data[position]
        holder.apply(novel, refreshTime)
    }
}