.class Lfr/bmartel/youtubetv/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr/bmartel/youtubetv/a;->onProgressUpdate(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:F

.field final synthetic c:Lfr/bmartel/youtubetv/a;


# direct methods
.method constructor <init>(Lfr/bmartel/youtubetv/a;F)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a$b;->c:Lfr/bmartel/youtubetv/a;

    iput p2, p0, Lfr/bmartel/youtubetv/a$b;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lfr/bmartel/youtubetv/a$b;->c:Lfr/bmartel/youtubetv/a;

    invoke-static {v0}, Lfr/bmartel/youtubetv/a;->b(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/g/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/a$b;->c:Lfr/bmartel/youtubetv/a;

    invoke-static {v0}, Lfr/bmartel/youtubetv/a;->b(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/g/c;

    move-result-object v0

    iget v1, p0, Lfr/bmartel/youtubetv/a$b;->b:F

    invoke-interface {v0, v1}, Lfr/bmartel/youtubetv/g/c;->a(F)V

    :cond_0
    return-void
.end method
