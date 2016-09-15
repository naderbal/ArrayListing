package com.internship.listing20.listing;

import com.internship.listing20.components.Article;

/**
 * Created by Nader on 23-Aug-16.
 */

public class ArticleItem extends ListingItem {
    final Article article;

    public ArticleItem(Article article) {
        this.article = article;
        setType(ListingItemType.ARTICLE);
    }

    public Article getArticle() {
        return article;
    }
}
