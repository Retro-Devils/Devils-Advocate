.class Lfr/bmartel/youtubetv/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr/bmartel/youtubetv/a;->onPlayerStateChange(IJFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:F

.field final synthetic d:F

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:J

.field final synthetic g:F

.field final synthetic h:Ljava/lang/String;

.field final synthetic i:Ljava/lang/String;

.field final synthetic j:Ljava/lang/String;

.field final synthetic k:Lfr/bmartel/youtubetv/a;


# direct methods
.method constructor <init>(Lfr/bmartel/youtubetv/a;IFFLjava/lang/String;JFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    iput p2, p0, Lfr/bmartel/youtubetv/a$c;->b:I

    iput p3, p0, Lfr/bmartel/youtubetv/a$c;->c:F

    iput p4, p0, Lfr/bmartel/youtubetv/a$c;->d:F

    iput-object p5, p0, Lfr/bmartel/youtubetv/a$c;->e:Ljava/lang/String;

    iput-wide p6, p0, Lfr/bmartel/youtubetv/a$c;->f:J

    iput p8, p0, Lfr/bmartel/youtubetv/a$c;->g:F

    iput-object p9, p0, Lfr/bmartel/youtubetv/a$c;->h:Ljava/lang/String;

    iput-object p10, p0, Lfr/bmartel/youtubetv/a$c;->i:Ljava/lang/String;

    iput-object p11, p0, Lfr/bmartel/youtubetv/a$c;->j:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    iget v0, p0, Lfr/bmartel/youtubetv/a$c;->b:I

    invoke-static {v0}, Lfr/bmartel/youtubetv/h/g;->b(I)Lfr/bmartel/youtubetv/h/g;

    move-result-object v0

    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->c(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/YoutubeTvView;

    move-result-object v1

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/YoutubeTvView;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lfr/bmartel/youtubetv/a$f;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v1, :pswitch_data_0

    :goto_0
    const/4 v7, 0x1

    const/4 v8, 0x1

    goto :goto_2

    :pswitch_0
    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1, v3}, Lfr/bmartel/youtubetv/a;->e(Lfr/bmartel/youtubetv/a;Z)Z

    const/4 v7, 0x1

    :goto_1
    const/4 v8, 0x3

    goto :goto_2

    :pswitch_1
    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1, v3}, Lfr/bmartel/youtubetv/a;->e(Lfr/bmartel/youtubetv/a;Z)Z

    const/4 v2, 0x6

    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->f(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/g/a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->f(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/g/a;

    move-result-object v1

    iget v3, p0, Lfr/bmartel/youtubetv/a$c;->c:F

    iget v5, p0, Lfr/bmartel/youtubetv/a$c;->d:F

    invoke-interface {v1, v3, v5}, Lfr/bmartel/youtubetv/g/a;->a(FF)V

    :cond_0
    const/4 v7, 0x1

    const/4 v8, 0x6

    goto :goto_2

    :pswitch_2
    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->d(Lfr/bmartel/youtubetv/a;)Z

    move-result v1

    xor-int/2addr v1, v4

    iget-object v2, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v2, v4}, Lfr/bmartel/youtubetv/a;->e(Lfr/bmartel/youtubetv/a;Z)Z

    const/4 v2, 0x2

    move v7, v1

    const/4 v8, 0x2

    goto :goto_2

    :pswitch_3
    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->d(Lfr/bmartel/youtubetv/a;)Z

    move-result v1

    xor-int/2addr v1, v4

    iget-object v3, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v3, v4}, Lfr/bmartel/youtubetv/a;->e(Lfr/bmartel/youtubetv/a;Z)Z

    move v7, v1

    goto :goto_1

    :pswitch_4
    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->c(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/YoutubeTvView;

    move-result-object v1

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/YoutubeTvView;->getPlaylistIndex()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->c(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/YoutubeTvView;

    move-result-object v1

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/YoutubeTvView;->l()V

    :cond_1
    :pswitch_5
    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1, v3}, Lfr/bmartel/youtubetv/a;->e(Lfr/bmartel/youtubetv/a;Z)Z

    goto :goto_0

    :goto_2
    iget-object v5, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    iget-object v6, p0, Lfr/bmartel/youtubetv/a$c;->e:Ljava/lang/String;

    iget-wide v9, p0, Lfr/bmartel/youtubetv/a$c;->f:J

    iget v11, p0, Lfr/bmartel/youtubetv/a$c;->g:F

    iget-object v12, p0, Lfr/bmartel/youtubetv/a$c;->h:Ljava/lang/String;

    invoke-static {v5}, Lfr/bmartel/youtubetv/a;->c(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/YoutubeTvView;

    move-result-object v1

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/YoutubeTvView;->getMediaSession()Landroid/media/session/MediaSession;

    move-result-object v13

    invoke-static/range {v5 .. v13}, Lfr/bmartel/youtubetv/a;->g(Lfr/bmartel/youtubetv/a;Ljava/lang/String;ZIJFLjava/lang/String;Landroid/media/session/MediaSession;)V

    :cond_2
    iget-object v1, p0, Lfr/bmartel/youtubetv/a$c;->k:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->a(Lfr/bmartel/youtubetv/a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfr/bmartel/youtubetv/g/b;

    iget-wide v3, p0, Lfr/bmartel/youtubetv/a$c;->f:J

    iget v5, p0, Lfr/bmartel/youtubetv/a$c;->g:F

    iget v6, p0, Lfr/bmartel/youtubetv/a$c;->c:F

    new-instance v7, Lfr/bmartel/youtubetv/h/e;

    iget-object v2, p0, Lfr/bmartel/youtubetv/a$c;->e:Ljava/lang/String;

    iget-object v9, p0, Lfr/bmartel/youtubetv/a$c;->i:Ljava/lang/String;

    iget-object v10, p0, Lfr/bmartel/youtubetv/a$c;->h:Ljava/lang/String;

    iget-object v11, p0, Lfr/bmartel/youtubetv/a$c;->j:Ljava/lang/String;

    invoke-static {v11}, Lfr/bmartel/youtubetv/i/a;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    invoke-direct {v7, v2, v9, v10, v11}, Lfr/bmartel/youtubetv/h/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object v2, v0

    invoke-interface/range {v1 .. v7}, Lfr/bmartel/youtubetv/g/b;->a(Lfr/bmartel/youtubetv/h/g;JFFLfr/bmartel/youtubetv/h/e;)V

    goto :goto_3

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
