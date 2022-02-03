.class Landroidx/leanback/widget/SearchBar$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/leanback/widget/SearchBar;->onFinishInflate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/leanback/widget/SearchBar;


# direct methods
.method constructor <init>(Landroidx/leanback/widget/SearchBar;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/SearchBar$h;->a:Landroidx/leanback/widget/SearchBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 1

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$h;->a:Landroidx/leanback/widget/SearchBar;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->a()V

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$h;->a:Landroidx/leanback/widget/SearchBar;

    iget-boolean v0, p1, Landroidx/leanback/widget/SearchBar;->m:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->i()V

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$h;->a:Landroidx/leanback/widget/SearchBar;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/leanback/widget/SearchBar;->m:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->j()V

    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$h;->a:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1, p2}, Landroidx/leanback/widget/SearchBar;->n(Z)V

    return-void
.end method
