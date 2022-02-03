.class Lcom/digdroid/alman/dig/o2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2;->t(Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/o2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$a;->b:Lcom/digdroid/alman/dig/o2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$a;->b:Lcom/digdroid/alman/dig/o2;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/o2;->h:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->c(Lcom/digdroid/alman/dig/o2;)V

    :cond_0
    return-void
.end method
