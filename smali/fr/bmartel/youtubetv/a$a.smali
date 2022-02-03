.class Lfr/bmartel/youtubetv/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr/bmartel/youtubetv/a;->onPlayerReady(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lfr/bmartel/youtubetv/a;


# direct methods
.method constructor <init>(Lfr/bmartel/youtubetv/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a$a;->f:Lfr/bmartel/youtubetv/a;

    iput-object p2, p0, Lfr/bmartel/youtubetv/a$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lfr/bmartel/youtubetv/a$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lfr/bmartel/youtubetv/a$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lfr/bmartel/youtubetv/a$a;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v0, Lfr/bmartel/youtubetv/h/e;

    iget-object v1, p0, Lfr/bmartel/youtubetv/a$a;->b:Ljava/lang/String;

    iget-object v2, p0, Lfr/bmartel/youtubetv/a$a;->c:Ljava/lang/String;

    iget-object v3, p0, Lfr/bmartel/youtubetv/a$a;->d:Ljava/lang/String;

    iget-object v4, p0, Lfr/bmartel/youtubetv/a$a;->e:Ljava/lang/String;

    invoke-static {v4}, Lfr/bmartel/youtubetv/i/a;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lfr/bmartel/youtubetv/h/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/a$a;->f:Lfr/bmartel/youtubetv/a;

    invoke-static {v1}, Lfr/bmartel/youtubetv/a;->a(Lfr/bmartel/youtubetv/a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfr/bmartel/youtubetv/g/b;

    invoke-interface {v2, v0}, Lfr/bmartel/youtubetv/g/b;->b(Lfr/bmartel/youtubetv/h/e;)V

    goto :goto_0

    :cond_0
    return-void
.end method
