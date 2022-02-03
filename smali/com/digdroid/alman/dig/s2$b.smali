.class Lcom/digdroid/alman/dig/s2$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s2;->Z0(Lcom/digdroid/alman/dig/s2$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/s2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s2$b;->b:Lcom/digdroid/alman/dig/s2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/s2$b;->b:Lcom/digdroid/alman/dig/s2;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    aput-object v1, p2, v0

    const/16 v0, 0x64

    invoke-static {p1, p2, v0}, Landroidx/core/app/a;->k(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void
.end method
