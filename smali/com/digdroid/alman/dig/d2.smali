.class public Lcom/digdroid/alman/dig/d2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Lcom/digdroid/alman/dig/q1;

.field b:Lcom/digdroid/alman/dig/h;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/d2;->a:Lcom/digdroid/alman/dig/q1;

    iput-object v0, p0, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    iput-object p1, p0, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    return-void
.end method

.method public constructor <init>(Lcom/digdroid/alman/dig/q1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/d2;->a:Lcom/digdroid/alman/dig/q1;

    iput-object v0, p0, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    iput-object p1, p0, Lcom/digdroid/alman/dig/d2;->a:Lcom/digdroid/alman/dig/q1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d2;->a:Lcom/digdroid/alman/dig/q1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/q1;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/h;->v()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d2;->a:Lcom/digdroid/alman/dig/q1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/CursorAdapter;->getCount()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/h;->c()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c()Landroid/database/Cursor;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d2;->a:Lcom/digdroid/alman/dig/q1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/CursorAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/h;->w()Landroid/database/Cursor;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
