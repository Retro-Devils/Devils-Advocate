.class Lcom/digdroid/alman/dig/r3$v;
.super Lcom/digdroid/alman/dig/r3$k;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/r3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "v"
.end annotation


# instance fields
.field final synthetic f:Lcom/digdroid/alman/dig/r3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$v;->f:Lcom/digdroid/alman/dig/r3;

    new-instance v0, Lcom/digdroid/alman/dig/r3$v$a;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/r3$v$a;-><init>(Lcom/digdroid/alman/dig/r3;)V

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/digdroid/alman/dig/r3$k;-><init>(Lcom/digdroid/alman/dig/r3;Ljava/lang/String;Ljava/io/FilenameFilter;Ljava/util/ArrayList;)V

    return-void
.end method
