.class public Lfr/bmartel/youtubetv/h/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/h/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/h/f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lfr/bmartel/youtubetv/h/e;->a:Ljava/lang/String;

    iput-object v0, p0, Lfr/bmartel/youtubetv/h/e;->b:Ljava/lang/String;

    iput-object v0, p0, Lfr/bmartel/youtubetv/h/e;->c:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/h/e;->d:Ljava/util/List;

    iput-object p1, p0, Lfr/bmartel/youtubetv/h/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lfr/bmartel/youtubetv/h/e;->b:Ljava/lang/String;

    iput-object p3, p0, Lfr/bmartel/youtubetv/h/e;->c:Ljava/lang/String;

    iput-object p4, p0, Lfr/bmartel/youtubetv/h/e;->d:Ljava/util/List;

    return-void
.end method
