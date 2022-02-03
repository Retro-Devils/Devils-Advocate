.class Landroidx/leanback/widget/SearchBar$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


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

    iput-object p1, p0, Landroidx/leanback/widget/SearchBar$f;->a:Landroidx/leanback/widget/SearchBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 p1, 0x1

    const-wide/16 v0, 0x1f4

    const/4 p3, 0x3

    if-eq p3, p2, :cond_0

    if-nez p2, :cond_1

    :cond_0
    iget-object p3, p0, Landroidx/leanback/widget/SearchBar$f;->a:Landroidx/leanback/widget/SearchBar;

    iget-object v2, p3, Landroidx/leanback/widget/SearchBar;->c:Landroidx/leanback/widget/SearchBar$k;

    if-eqz v2, :cond_1

    invoke-virtual {p3}, Landroidx/leanback/widget/SearchBar;->a()V

    iget-object p2, p0, Landroidx/leanback/widget/SearchBar$f;->a:Landroidx/leanback/widget/SearchBar;

    iget-object p2, p2, Landroidx/leanback/widget/SearchBar;->k:Landroid/os/Handler;

    new-instance p3, Landroidx/leanback/widget/SearchBar$f$a;

    invoke-direct {p3, p0}, Landroidx/leanback/widget/SearchBar$f$a;-><init>(Landroidx/leanback/widget/SearchBar$f;)V

    :goto_0
    invoke-virtual {p2, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_1
    if-ne p1, p2, :cond_2

    iget-object p3, p0, Landroidx/leanback/widget/SearchBar$f;->a:Landroidx/leanback/widget/SearchBar;

    iget-object v2, p3, Landroidx/leanback/widget/SearchBar;->c:Landroidx/leanback/widget/SearchBar$k;

    if-eqz v2, :cond_2

    invoke-virtual {p3}, Landroidx/leanback/widget/SearchBar;->a()V

    iget-object p2, p0, Landroidx/leanback/widget/SearchBar$f;->a:Landroidx/leanback/widget/SearchBar;

    iget-object p2, p2, Landroidx/leanback/widget/SearchBar;->k:Landroid/os/Handler;

    new-instance p3, Landroidx/leanback/widget/SearchBar$f$b;

    invoke-direct {p3, p0}, Landroidx/leanback/widget/SearchBar$f$b;-><init>(Landroidx/leanback/widget/SearchBar$f;)V

    goto :goto_0

    :cond_2
    const/4 p3, 0x2

    if-ne p3, p2, :cond_3

    iget-object p2, p0, Landroidx/leanback/widget/SearchBar$f;->a:Landroidx/leanback/widget/SearchBar;

    invoke-virtual {p2}, Landroidx/leanback/widget/SearchBar;->a()V

    iget-object p2, p0, Landroidx/leanback/widget/SearchBar$f;->a:Landroidx/leanback/widget/SearchBar;

    iget-object p2, p2, Landroidx/leanback/widget/SearchBar;->k:Landroid/os/Handler;

    new-instance p3, Landroidx/leanback/widget/SearchBar$f$c;

    invoke-direct {p3, p0}, Landroidx/leanback/widget/SearchBar$f$c;-><init>(Landroidx/leanback/widget/SearchBar$f;)V

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
