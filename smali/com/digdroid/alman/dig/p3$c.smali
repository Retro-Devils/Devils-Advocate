.class Lcom/digdroid/alman/dig/p3$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p3;->l(Lcom/digdroid/alman/dig/MainActivity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$c;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lcom/digdroid/alman/dig/p3$g;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p3$c;->a:Lcom/digdroid/alman/dig/MainActivity;

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-direct {v0, v1, p1}, Lcom/digdroid/alman/dig/p3$g;-><init>(Lcom/digdroid/alman/dig/MainActivity;Ljava/lang/String;)V

    new-array p1, v2, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
