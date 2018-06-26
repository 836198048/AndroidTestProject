package com.fzwsc.mytestproject.base;

import android.content.Context;

import com.zhy.adapter.recyclerview.CommonAdapter;

import java.util.Collection;
import java.util.List;

/**
 * Created by HJA on 2017/3/30.
 */

public abstract class BaseRecyclerAdapter<T> extends CommonAdapter<T> {


  public BaseRecyclerAdapter(Context context, int layoutId, List<T> datas) {
    super(context, layoutId, datas);
  }

  public void setDataList(Collection<T> list) {
    this.mDatas.clear();
    this.mDatas.addAll(list);
    notifyDataSetChanged();
  }

  public void addData(List<T> addDatas){
    int lastIndex = this.mDatas.size();
    if (this.mDatas.addAll(addDatas)) {
      notifyItemRangeInserted(lastIndex, addDatas.size());
    }
    notifyDataSetChanged();
  }

  public void remove(int position) {
    this.mDatas.remove(position);
    notifyItemRemoved(position);

    if(position != (mDatas.size())){ // 如果移除的是最后一个，忽略
      notifyItemRangeChanged(position,this.mDatas.size()-position);
    }
  }

  public void clear() {
    mDatas.clear();
    notifyDataSetChanged();
  }

}
