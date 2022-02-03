.class public Lfr/bmartel/youtubetv/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lfr/bmartel/youtubetv/h/f;

.field public static final b:Lfr/bmartel/youtubetv/h/d;

.field public static final c:Lfr/bmartel/youtubetv/h/c;

.field public static final d:Lfr/bmartel/youtubetv/h/b;

.field public static final e:Lfr/bmartel/youtubetv/h/a;

.field public static final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lfr/bmartel/youtubetv/h/f;->h:Lfr/bmartel/youtubetv/h/f;

    sput-object v0, Lfr/bmartel/youtubetv/f;->a:Lfr/bmartel/youtubetv/h/f;

    sget-object v0, Lfr/bmartel/youtubetv/h/d;->d:Lfr/bmartel/youtubetv/h/d;

    sput-object v0, Lfr/bmartel/youtubetv/f;->b:Lfr/bmartel/youtubetv/h/d;

    sget-object v0, Lfr/bmartel/youtubetv/h/c;->b:Lfr/bmartel/youtubetv/h/c;

    sput-object v0, Lfr/bmartel/youtubetv/f;->c:Lfr/bmartel/youtubetv/h/c;

    sget-object v0, Lfr/bmartel/youtubetv/h/b;->c:Lfr/bmartel/youtubetv/h/b;

    sput-object v0, Lfr/bmartel/youtubetv/f;->d:Lfr/bmartel/youtubetv/h/b;

    sget-object v0, Lfr/bmartel/youtubetv/h/a;->f:Lfr/bmartel/youtubetv/h/a;

    sput-object v0, Lfr/bmartel/youtubetv/f;->e:Lfr/bmartel/youtubetv/h/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lfr/bmartel/youtubetv/f;->f:Ljava/util/List;

    const-string v1, "maxresdefault"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "sddefault"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "hqdefault"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "mqdefault"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "default"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
