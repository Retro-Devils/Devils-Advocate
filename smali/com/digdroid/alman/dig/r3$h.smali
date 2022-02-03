.class Lcom/digdroid/alman/dig/r3$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/r3$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r3;->R2(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/r3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r3$h;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/r3$h;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "folder"

    const/4 v4, 0x0

    const/4 v5, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "none"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "file"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    packed-switch v5, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->x2(Lcom/digdroid/alman/dig/r3;)V

    goto :goto_1

    :pswitch_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/r3;->w2(Lcom/digdroid/alman/dig/r3;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1, v0}, Lcom/digdroid/alman/dig/r3;->p2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "audio"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/r3;->x2(Lcom/digdroid/alman/dig/r3;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1, v0, v4}, Lcom/digdroid/alman/dig/r3;->y2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/r3;->z2(Lcom/digdroid/alman/dig/r3;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/r3;->B2(Lcom/digdroid/alman/dig/r3;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->x2(Lcom/digdroid/alman/dig/r3;)V

    new-instance v0, Lcom/digdroid/alman/dig/r3$o;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/digdroid/alman/dig/r3$o;-><init>(Lcom/digdroid/alman/dig/r3;Lcom/digdroid/alman/dig/r3$b;)V

    new-array v1, v4, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/r3;->A2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$h;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/r3;->C2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4ba2e392 -> :sswitch_2
        0x2ff57c -> :sswitch_1
        0x33af38 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/String;I)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->w2(Lcom/digdroid/alman/dig/r3;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->x2(Lcom/digdroid/alman/dig/r3;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0, p1, p2}, Lcom/digdroid/alman/dig/r3;->y2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/r3$h;->a:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/r3;->A2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$h;->c:Lcom/digdroid/alman/dig/r3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/r3$h;->b:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/r3;->C2(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    return-void
.end method
