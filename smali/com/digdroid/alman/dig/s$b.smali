.class Lcom/digdroid/alman/dig/s$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/p3$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s;->r1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/s;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$b;->a:Lcom/digdroid/alman/dig/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/r3;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/s$b;->a:Lcom/digdroid/alman/dig/s;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/s;->j3(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
