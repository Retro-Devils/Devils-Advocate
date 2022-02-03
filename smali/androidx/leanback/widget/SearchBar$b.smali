.class Landroidx/leanback/widget/SearchBar$b;
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

    iput-object p1, p0, Landroidx/leanback/widget/SearchBar$b;->a:Landroidx/leanback/widget/SearchBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$b;->a:Landroidx/leanback/widget/SearchBar;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->h()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/leanback/widget/SearchBar;->a()V

    :goto_0
    iget-object p1, p0, Landroidx/leanback/widget/SearchBar$b;->a:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p1, p2}, Landroidx/leanback/widget/SearchBar;->n(Z)V

    return-void
.end method
