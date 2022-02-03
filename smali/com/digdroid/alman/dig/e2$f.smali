.class Lcom/digdroid/alman/dig/e2$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->q(Lcom/digdroid/alman/dig/d2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/d2;

.field final synthetic c:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/d2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$f;->c:Lcom/digdroid/alman/dig/e2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2$f;->b:Lcom/digdroid/alman/dig/d2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$f;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$f;->b:Lcom/digdroid/alman/dig/d2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$f;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    return-void
.end method
